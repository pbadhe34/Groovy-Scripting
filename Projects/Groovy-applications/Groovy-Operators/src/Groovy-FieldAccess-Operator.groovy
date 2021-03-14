class User {
	public final String name
	User(String name) { this.name = name}
	String getName() { "Name: $name" }
}
def user = new User('Mohan')


assert user.name == 'Name: Mohan'
/*The user.name call triggers a call to the property of the same name,
 to the getter for name. To retrieve the field instead of calling
 the getter,  use the direct field access operator:
 */
assert user.@name == 'Mohan'
println "The User name is ${user.@name}"