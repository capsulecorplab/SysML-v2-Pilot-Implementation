define([
    'codemirror/lib/codemirror',
    'codemirror/mode/clike/clike',
    'base/js/namespace',
], function (
    CodeMirror,
    clike,
    IPython) {
    "use strict";
    var onload = function () {
        console.log("Loading kernel.js from ISysML")
        enableMode(CodeMirror);
    }
    return {onload: onload};
});

var enableMode = function (CodeMirror) {
    function words(str) {
        var obj = {}, words = str.split(" ");
        for (var i = 0; i < words.length; ++i) obj[words[i]] = true;
        return obj;
    }

    CodeMirror.defineMode("sysml", function (config) {
        return CodeMirror.getMode(config, {
            name: "clike",
            keywords: words("about abstract accept action activity alias allInstances any as assert assoc assume bind block by " +
                "comment connect constraint decide def do else end entry exhibit exit first flow fork from hastype id if import " +
                "in inout instanceof interface individual join link merge nonunique of ordered out package part perform port private " +
                "protected public redefines ref require requirement satisfy send snapshot specializes state stream subsets succession then " + 
                "timeslice to transition type typed value"),
            defKeywords: words("action activity assoc block constraint def id link interface package part port ref state transition type value"),
            typeFirstDefinitions: true,
            atoms: words("true false null"),
            number: /^(?:0x[a-f\d_]+|0b[01_]+|(?:[\d_]+\.?\d*|\.\d+)(?:e[-+]?[\d_]+)?)(u|ll?|l|f)?/i,
            modeProps: {fold: ["brace"]},
            hooks: {
				"'": function(stream) {
						var escaped = false, next, end = false;
						while ((next = stream.next()) != null) {
							if (next == "'" && !escaped) { break; }
							escaped = !escaped && next == "\\";
						}
						return "variable";
				},
				"/": function(stream) {
					if (stream.match("/*", false)) {
						stream.next();
					}
					return false;
				}
			}
        });
    });
    CodeMirror.defineMIME("text/x-sysml", "sysml");
};
