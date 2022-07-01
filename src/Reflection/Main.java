package Reflection;

public class Main {

	public long a = 10;
	public long b = 20;
	private long c = 30;
  
  public Main() {
  }
  
  public Main(long a, long b, long c) {
  this.a = a;
  this.b = b;
  this.c = c;
  }

  public void squareA() {
    this.a *= this.a;
  }
  
  public void squareB() {
    this.b *= this.b;
  }
  
  public void squareC() {
	this.c *= this.c;
  }
  
  public long getA() {
    return a;
  }

  public long getB() {
    return b;
  }
  
  public long getC() {
	 return c;
  }
  
  public void setA(long a) {
    this.a = a;
  }
  
  public void setB(long b) {
    this.b = b;
  }
  
  public void setC(long c) {
	this.c = c;
  }
  
  public String toString() {
    return String.format("(a:%d, b:%d, c:%d)", a, b, c);
  }
}