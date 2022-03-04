package ChapterTwo;

import java.util.Scanner;
	public class FiveIntegers{
	public static void main (String [] args) {
	Scanner digit = new Scanner(System.in);
	
	System.out.println ("Enter first integer");
	int firstInteger = digit.nextInt();
	
	System.out.println ("Enter second integer");
	int secondInteger = digit.nextInt();
	
	System.out.println ("Enter third integer");
	int thirdInteger = digit.nextInt();
	
	System.out.println ("Enter fourth integer");
	int fourthInteger = digit.nextInt();
	
	System.out.println ("Enter fifth integer");
	int fifthInteger = digit.nextInt();
	

	if (firstInteger > secondInteger) {
	 if (firstInteger> thirdInteger){
	 if (firstInteger > fourthInteger) { 
	 if (firstInteger> fifthInteger){
	 System.out.printf("%d is the largest\n", firstInteger);
	 }
	 }
	 }
	 }
	
	
	if (firstInteger < secondInteger) {
	 if (firstInteger < thirdInteger){
	 if (firstInteger <fourthInteger){
	 if (firstInteger < fifthInteger){
	 System.out.printf("%d is the smallest\n", firstInteger);
	 }
	 }
	 }
	 }
	 
	 if (secondInteger > firstInteger) {
	 if (secondInteger> thirdInteger){
	 if (secondInteger > fourthInteger) { 
	 if (secondInteger> fifthInteger){
	 System.out.printf("%d is the largest\n", secondInteger);
	 }
	 }
	 }
	 }
	
	
	if (secondInteger < firstInteger) {
	 if (secondInteger < thirdInteger){
	 if (secondInteger <fourthInteger){
	 if (secondInteger< fifthInteger){
	 System.out.printf("%d is the smallest\n", secondInteger);
	 }
	 }
	 }
	 }
	 
	 if (thirdInteger > firstInteger){
	 if (thirdInteger> secondInteger){
	 if (thirdInteger > fourthInteger) { 
	 if (thirdInteger> fifthInteger){
	 System.out.printf("%d is the largest\n", thirdInteger);
	 }
	 }
	 }
	 }
	
	
	 if (thirdInteger < firstInteger){
	 if (thirdInteger < secondInteger){
	 if (thirdInteger <fourthInteger){
	 if (thirdInteger< fifthInteger){
	 System.out.printf("%d is the smallest\n", thirdInteger);
	 }
	 }
	 }
	 }
	
	if (fourthInteger > firstInteger) {
	 if (fourthInteger> secondInteger){
	 if (fourthInteger > thirdInteger) { 
	 if (fourthInteger> fifthInteger){
	 System.out.printf("%d is the largest\n", fourthInteger);
	 }
	 }
	 }
	 }
	
	
	if (fourthInteger < firstInteger) {
	 if (fourthInteger < secondInteger){
	 if (fourthInteger <thirdInteger){
	 if (fourthInteger< fifthInteger){
	 System.out.printf("%d is the smallest\n", fourthInteger);
	 }
	 }
	 }
	 }
	 
	 if (fifthInteger > firstInteger) {
	 if (fifthInteger> secondInteger){
	 if (fifthInteger > thirdInteger) { 
	 if (fifthInteger> fourthInteger){
	 System.out.printf("%d is the largest\n", fourthInteger);
	 }
	 }
	 }
	 }
	
	
	if (fifthInteger < firstInteger) {
	 if (fifthInteger < secondInteger){
	 if (fifthInteger <thirdInteger){
	 if (fifthInteger< fourthInteger){
	 System.out.printf("%d is the smallest\n", fifthInteger);
	 }
	 }
	 }
	 }
	
	
	}
	}
