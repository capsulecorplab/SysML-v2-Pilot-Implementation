/**
 * This package defines the base types for connections and related structural elements 
 * in the SysML language.
 */
package Connections {
	private import Objects::BinaryLinkObject;
	private import Objects::binaryLinkObjects;
	private import Items::Item;
	private import Parts::Part;
	private import Parts::parts;

	/**
	 * Connection is the most general class of links between two Parts within some 
	 * containing structure. Connction is the base type of all ConnectionDefinitions.
	 * 
	 * (Note that this does not include BindinConnectors, which are typed by
	 * the kernel Association SelfLink.)
	 */
	abstract connection def Connection :> BinaryLinkObject, Part { // Need to handle n-ary connections.
		end source: Item[0..*] :>> BinaryLinkObject::source;
		end target: Item[0..*] :>> BinaryLinkObject::target;
	}
	
	/**
	 * connections is the base feature of all ConnectionUsages.
	 */
	abstract connection connections: Connection[0..*] :> binaryLinkObjects;
}