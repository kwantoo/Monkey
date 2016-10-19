public int binaryGap(value) {
String binaryRepresentation = Integer.toBinaryString(value);
int biggestGap = 0;
int tempGap = 0;
boolean gapStarted = false;

for (int i = 0; i < binaryRepresentation.length()-1; i++) {
char actual = binaryRepresentation.charAt(i);
char next = binaryRepresentation.charAt(i+1);
if (actual=='1' && next=='0') {
gapStarted = true;
tempGap = 0;
}
if (gapStarted == true) {
if (actual=='0'){
tempGap++;
}
if (next=='1') {
gapStarted = false;
if (biggestGap < tempGap) {
biggestGap = tempGap;
}
}
}

}
return biggestGap;
}