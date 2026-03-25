import java.util.Random;
import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        if(a>=b && a>=c){
                 return a;}
        else if(b>=a && b>=c){
                 return b;}
        else{
                 return c;}
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] resultado = new int [limite];

        int i=1;
        while(i<=limite){
        resultado [ i - 1 ]= numero*i;
        i++; }
        return resultado;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if(n<0){
        return 0;
        }
    else if ( n == 0) {
       return 1;
     }
     int resultado=1;
      int i=1;
     while(i<=n){
     resultado=resultado*i;
     i++;
     }
        return resultado;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1){
         return false;}
       for (int i=2; i<numero; i++){
       if (numero % i == 0){
       return false;}
       }
       return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n <= 0){
        return new int [0]; }
         int[] serie = new int[n];

    if (n >= 1) {
        serie[0] = 0;
    }

    if (n >= 2) {
        serie[1] = 1;
    }

    for (int i = 2; i < n; i++) {
        serie[i] = serie[i - 1] + serie[i - 2];
    }

    return serie;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int i=0; i<arreglo.length; i++){
      suma += arreglo [i];
    }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        if (arreglo.length ==0){
        return 0;
  }
        double suma = 0;
        for (int i=0; i<arreglo.length; i++){
      suma += arreglo [i];
      
    }
        return suma/ arreglo.length ;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        if( arreglo.length == 0){
        return 0;
   }
        int mayor = arreglo[0];

        for ( int i=1; i<arreglo.length; i++){
        if ( arreglo [i]>mayor){
        mayor = arreglo[i];
   }
   }
       return mayor;
   
        
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
          if( arreglo.length == 0){
        return 0;
   }
         int menor = arreglo[0];

        for ( int i=1; i<arreglo.length; i++){
        if ( arreglo [i]<menor){
        menor = arreglo[i];
   }
   }
       return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
       for ( int i=0; i<arreglo.length; i++){
       if (arreglo[i] == elemento){
        return true;   
    }
    }
   
        return false;
    }
    

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int [] invertir = new int[arreglo.length];
        for ( int i=0; i<arreglo.length; i++){
        invertir[i] = arreglo[arreglo.length - 1 - i];
    }
      return invertir;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
        for (int j = 0; j < arreglo.length - 1 - i; j++) {

            if (arreglo[j] > arreglo[j + 1]) {

                int temp = arreglo[j];
                arreglo[j] = arreglo[j + 1];
                arreglo[j + 1] = temp;
            }
        }
    }

    return arreglo;
}

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
       
    int[] auxiliar = new int[arreglo.length];
    int contador = 0;

    for (int i = 0; i < arreglo.length; i++) {

        boolean repetido = false;

        for (int j = 0; j < contador; j++) {
            if (arreglo[i] == auxiliar[j]) {
                repetido = true;
                break;
            }
        }

        if (!repetido) {
            auxiliar[contador] = arreglo[i];
            contador++;
        }
    }

    int[] resultado = new int[contador];
    for (int i = 0; i < contador; i++) {
        resultado[i] = auxiliar[i];
    }

    return resultado;
}

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        if (arreglo.length == 0) {
    return new int[0];
  }
        posiciones= posiciones % arreglo.length;
        int[] resultado = new int [arreglo.length];
        int indice= 0;
     for ( int i=posiciones ; i < arreglo.length; i++){
      resultado [indice] = arreglo [i];
      indice ++;
  
    } 
    
    for (int i = 0; i < posiciones; i++) {
        resultado[indice] = arreglo[i];
        indice++;
    }

    return resultado;
}

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        int contador= 0;
       
       for ( int i=0; i<cadena.length(); i++){
        cadena.charAt(i);
        contador++;
    }
     return contador;
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
     String anedac = "";
     for (int i = cadena.length() - 1; i>=0; i--){
    anedac = anedac + cadena.charAt(i);
    
  }
 return anedac;
 }
        

    // Método que verifica si una cadena es un palíndromo
   public boolean esPalindromo(String cadena) {
    cadena = cadena.replaceAll("\\s+", "").toLowerCase();

    String invertida = "";
    for (int i = cadena.length() - 1; i >= 0; i--) {
        invertida += cadena.charAt(i);
    }

    return cadena.equals(invertida);
}
  

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
         if ( cadena == null || cadena.trim().isEmpty()){
         return 0;
}
    return cadena.trim().split("\\s+").length;
}

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
       String palabra = "";
      for ( int i=0; i<cadena.length(); i++){
     palabra = palabra + Character.toUpperCase(cadena.charAt(i));
    }
 return palabra;
   }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
      String palabra = "";
      for ( int i=0; i<cadena.length(); i++){
     palabra = palabra + Character.toLowerCase(cadena.charAt(i));
    }
 return palabra;
   }
    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
          int posicion = cadena.indexOf(antiguaSubcadena);
    if (posicion == -1) {
        return cadena;
    }
    String parte1 = cadena.substring(0, posicion);
    String parte2 = cadena.substring(posicion + antiguaSubcadena.length());
    return parte1 + nuevaSubcadena + parte2;
}


    // Método que valida un correo electrónico
   public boolean validarCorreoElectronico(String correo) {
    if (correo == null) return false;

    return correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
}

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
       if (lista.size()==0){
       return 0;
}
        double suma = 0;
       for ( int i=0; i< lista.size();i++){
       suma += lista.get(i);
} 
      return suma/lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
    if ( numero == 0) return "0";
    
    boolean negativo = numero<0;
    numero= Math.abs(numero);
    
    String binario = "";
  while (numero > 0) {
    binario = (numero % 2) + binario;
    numero /= 2;
}
 return negativo ? "-" + binario : binario;
}

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
    if (numero == 0) return "0";

    boolean negativo = numero < 0;
    numero = Math.abs(numero);

    String hex = "";
    while (numero > 0) {
        int residuo = numero % 16;

        if (residuo < 10) {
            hex = residuo + hex;
        } else {
            char letra = (char) ('A' + (residuo - 10));
            hex = letra + hex;
        }

        numero /= 16;
    }

    return negativo ? "-" + hex : hex;
}

    

public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {

    String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
    Random random = new Random();
    String eleccionPC = opciones[random.nextInt(5)];

    if (eleccionUsuario.equals(eleccionPC)) {
        return "Empate";
    }

    if (
        (eleccionUsuario.equals("Piedra") && (eleccionPC.equals("Tijera") || eleccionPC.equals("Lagarto"))) ||
        (eleccionUsuario.equals("Papel") && (eleccionPC.equals("Piedra") || eleccionPC.equals("Spock"))) ||
        (eleccionUsuario.equals("Tijera") && (eleccionPC.equals("Papel") || eleccionPC.equals("Lagarto"))) ||
        (eleccionUsuario.equals("Lagarto") && (eleccionPC.equals("Spock") || eleccionPC.equals("Papel"))) ||
        (eleccionUsuario.equals("Spock") && (eleccionPC.equals("Tijera") || eleccionPC.equals("Piedra")))
    ) {
        return "Ganaste";
    }

    return "Perdiste";
}
   public double areaCirculo(double radio) {
    return Math.PI * radio;
    }

   public String zoodiac(int day, int month) {
     if ((month == 2 && day > 29) ||
    ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)) {
    return "Invalid Date";
}

    if (month < 1 || month > 12 || day < 1 || day > 31) return "Invalid Date";

    if ((day >= 21 && month == 3) || (day <= 19 && month == 4)) return "Aries";
    if ((day >= 20 && month == 4) || (day <= 20 && month == 5)) return "Tauro";
    if ((day >= 21 && month == 5) || (day <= 20 && month == 6)) return "Gemini";
    if ((day >= 21 && month == 6) || (day <= 22 && month == 7)) return "Cancer";
    if ((day >= 23 && month == 7) || (day <= 22 && month == 8)) return "Leo";
    if ((day >= 23 && month == 8) || (day <= 22 && month == 9)) return "Virgo";
    if ((day >= 23 && month == 9) || (day <= 22 && month == 10)) return "Libra";
    if ((day >= 23 && month == 10) || (day <= 21 && month == 11)) return "Escorpio";
    if ((day >= 22 && month == 11) || (day <= 21 && month == 12)) return "Sagitario";
    if ((day >= 22 && month == 12) || (day <= 19 && month == 1)) return "Capricornio";
    if ((day >= 20 && month == 1) || (day <= 18 && month == 2)) return "Acuario";
    if ((day >= 19 && month == 2) || (day <= 20 && month == 3)) return "Piscis";

    return "Invalid Date";
}

public int[] combinarArreglos(int[] a, int[] b) {
    int[] resultado = new int[a.length + b.length];

    for (int i = 0; i < a.length; i++) {
        resultado[i] = a[i];
    }

    for (int i = 0; i < b.length; i++) {
        resultado[a.length + i] = b[i];
    }

    return resultado;
}

public int buscarSubcadena(String texto, String subcadena) {
    return texto.indexOf(subcadena);
}

public String pptls2(String[] arreglo) {
    String p1 = arreglo[0];
    String p2 = arreglo[1];

    if (p1.equals(p2)) return "Empate";

    if (
        (p1.equals("P") && (p2.equals("R") || p2.equals("V"))) ||
        (p1.equals("R") && (p2.equals("S") || p2.equals("L"))) ||
        (p1.equals("S") && (p2.equals("P") || p2.equals("L"))) ||
        (p1.equals("L") && (p2.equals("P") || p2.equals("V"))) ||
        (p1.equals("V") && (p2.equals("R") || p2.equals("S")))
    ) {
        return "Player 1";
    }

    return "Player 2";
}
}