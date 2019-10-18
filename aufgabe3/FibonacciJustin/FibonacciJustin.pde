void setup () {
  println("Fibunacci rekursiv = " + fibrec(3));
  println("Fibunacci iterativ = " + fibite(10));
} 



// Fibunacci rekursiv

int fibrec(int n) {
  if (n<=0) {
    throw new IllegalArgumentException("n muss >0 sein");
  }

  if (n<=2) {
    return 1;
  } else {
    return fibrec(n-1)+fibrec(n-2);
  }
} 




// Fibunacci iterativ

int x =1;
int y =1;
int z =1;

int fibite(int n) {

  if (n<=0) {
    throw new IllegalArgumentException("n muss >0 sein");
  }

  for (int i=0; i<(n-2); i++) {
    z = x+y;
    x = y;
    y = z;
  }
  return z;
}
