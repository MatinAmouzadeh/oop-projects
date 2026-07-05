package com.matin.calculator.backend;

public class BigInteger
{
	private int BigInt[];

	private int cBigInt;

	public BigInteger(String Num) {
		this.BigInt = new int[Num.length()];
		char theChar;
		int theCharAscii;
		for(int i=0; Num.length()>0; i++) {
			theChar = Num.charAt(i);
			theCharAscii = (int) theChar;
			this.BigInt[i] = theCharAscii - '0';
		}
	}

	public  BigInteger(int Array[]) {
		for(int x=0; x<Array.length; x++) {
			this.BigInt[x] = Array[x];
			this.cBigInt++;
		}
	}

	public BigInteger(int Array[], int ArrayLength) {
		for(int x=0; x<ArrayLength; x++) {
			this.BigInt[x] = Array[x];
		}
		if(this.cBigInt != ArrayLength) {
			System.out.println(
					"ERROR To BigInteger class, Constractor, if cBigInt != ArrayLength");
		}
	}

	public int[] getBigInt() {
		return this.BigInt;
	}

	public void setBigInt(int[] bigInt) {
		this.BigInt = bigInt;
	}

	public int getcBigInt() {
		return this.cBigInt;
	}

	public void setcBigInt(int cBigInt) {
		this.cBigInt = cBigInt;
	}


}
