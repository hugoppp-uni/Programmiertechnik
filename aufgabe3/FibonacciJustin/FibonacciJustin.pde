int fib(int n) {
  if ( n<=0 ) {
    throw new IllegalArgumentException("n muss > 0 sein");
  }

  if (n>2) { // fib(n<=2) ist 1 => n<=2 ist die Abbruchbedingung
    return fib(n-1)+fib(n-2);
  } else {
    return 1;
  }
}

void setup() {
  fib(1);
}
