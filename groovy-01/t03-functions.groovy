println removeLast('Hello World')
println removeLast2('Hello World')
def removeLast(String str) {
	return str.substring(0, str.length()-1);
}
def removeLast2(String str) {
	str.substring(0, str.length()-1);
}