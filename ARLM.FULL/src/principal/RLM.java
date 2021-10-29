package principal;

public class RLM extends Principal{
    public RLM(double detA) {
        super(detA);
    }

    public double[][] amatriz (){
        matriz[0][0] = 1;
        matriz[1][0] = 1;
        matriz[2][0] = 1;
        matriz[3][0] = 1;
        matriz[4][0] = 1;
        matriz[5][0] = 1;
        matriz[6][0] = 1;
        matriz[7][0] = 1;
        matriz[8][0] = 1;
        matriz[9][0] = 1;
        matriz[10][0] = 1;
        matriz[11][0] = 1;
        matriz[12][0] = 1;
        matriz[13][0] = 1;
        matriz[14][0] = 1;
        matriz[15][0] = 1;
        matriz[16][0] = 1;
        matriz[0][1] = 41.9;
        matriz[1][1] = 43.4;
        matriz[2][1] = 43.9;
        matriz[3][1] = 44.5;
        matriz[4][1] = 47.3;
        matriz[5][1] = 47.5;
        matriz[6][1] = 47.9;
        matriz[7][1] = 50.2;
        matriz[8][1] = 52.8;
        matriz[9][1] = 53.2;
        matriz[10][1] = 56.7;
        matriz[11][1] = 57.0;
        matriz[12][1] = 63.5;
        matriz[13][1] = 65.3;
        matriz[14][1] = 71.1;
        matriz[15][1] = 77.0;
        matriz[16][1] = 77.8;
        matriz[0][2] = 29.1;
        matriz[1][2] = 29.3;
        matriz[2][2] = 29.5;
        matriz[3][2] = 29.7;
        matriz[4][2] = 29.9;
        matriz[5][2] = 30.3;
        matriz[6][2] = 30.5;
        matriz[7][2] = 30.7;
        matriz[8][2] = 30.8;
        matriz[9][2] = 30.9;
        matriz[10][2] = 31.5;
        matriz[11][2] = 31.7;
        matriz[12][2] = 31.9;
        matriz[13][2] = 32.0;
        matriz[14][2] = 32.1;
        matriz[15][2] = 32.5;
        matriz[16][2] = 32.9;
        return matriz;
    }

    public double[] aarregloY (){
        arregloY[0] = 251.3;
        arregloY[1] = 251.3;
        arregloY[2] = 248.3;
        arregloY[3] = 267.5;
        arregloY[4] = 273.0;
        arregloY[5] = 276.5;
        arregloY[6] = 270.3;
        arregloY[7] = 274.9;
        arregloY[8] = 285.0;
        arregloY[9] = 290.0;
        arregloY[10] = 297.0;
        arregloY[11] = 302.5;
        arregloY[12] = 304.5;
        arregloY[13] = 309.3;
        arregloY[14] = 321.7;
        arregloY[15] = 330.7;
        arregloY[16] = 349.0;
        return arregloY;
    }

    public double[] aarregloF1(){
        arregloF1[0] = 81.5;
        arregloF1[1] = 81.4;
        arregloF1[2] = 82.2;
        arregloF1[3] = 42.9;
        arregloF1[4] = 44.4;
        arregloF1[5] = 64.2;
        return arregloF1;
    }

    public double[] aarregloF2(){
        arregloF2[0] = 33.2;
        arregloF2[1] = 34.3;
        arregloF2[2] = 35.2;
        arregloF2[3] = 28.9;
        arregloF2[4] = 31.3;
        arregloF2[5] = 31.4;
        return arregloF2;
    }

    public void MatrizOriginal(){
        System.out.println("Matriz Original:");
        for (int i = 0; i<17; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void MatrizTranspuesta(){
        for (int i = 0; i<3; i++){
            for (int j = 0; j < 17; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }

        System.out.println("\nMatriz Transpuesta:");
        for (int i = 0; i<3; i++){
            for (int j = 0; j < 17; j++) {
                System.out.print(matrizT[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void MatrizXT(){
        for (int i = 0; i<17; i++){
            arreglo1[i] = matriz[i][0] * matrizT[0][i];
            arreglo2[i] = matriz[i][0] * matrizT[1][i];
            arreglo3[i] = matriz[i][0] * matrizT[2][i];
            arreglo4[i] = matriz[i][1] * matrizT[0][i];
            arreglo5[i] = matriz[i][1] * matrizT[1][i];
            arreglo6[i] = matriz[i][1] * matrizT[2][i];
            arreglo7[i] = matriz[i][2] * matrizT[0][i];
            arreglo8[i] = matriz[i][2] * matrizT[1][i];
            arreglo9[i] = matriz[i][2] * matrizT[2][i];
        }

        for (int i = 0; i<17; i++){
            matrizXT[0][0] += arreglo1[i];
            matrizXT[0][1] += arreglo2[i];
            matrizXT[0][2] += arreglo3[i];
            matrizXT[1][0] += arreglo4[i];
            matrizXT[1][1] += arreglo5[i];
            matrizXT[1][2] += arreglo6[i];
            matrizXT[2][0] += arreglo7[i];
            matrizXT[2][1] += arreglo8[i];
            matrizXT[2][2] += arreglo9[i];
        }

        System.out.println("\nMatrizXT Resultante de Matriz Original por Matriz Transpuesta:");
        for (int i = 0; i<3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizXT[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void MatrizXTY(){
        for (int i = 0; i<17; i++){
            arreglo10[i] = matrizT[0][i] * arregloY[i];
            arreglo11[i] = matrizT[1][i] * arregloY[i];
            arreglo12[i] = matrizT[2][i] * arregloY[i];
        }

        for (int i = 0; i<17; i++){
            arregloX[0] += arreglo10[i];
            arregloX[1] += arreglo11[i];
            arregloX[2] += arreglo12[i];
        }

        System.out.println("\nMatriz Resultante de MatrizXT por MatrizY:");
        for (int i = 0; i<3; i++){
            System.out.println(arregloX[i]);
        }
    }

    public void Determinalte(){
        detA =((matrizXT[0][0]*matrizXT[1][1]*matrizXT[2][2])+(matrizXT[0][1]*matrizXT[1][2]*matrizXT[2][0])+(matrizXT[0][2]*matrizXT[1][0]*matrizXT[2][1]));
        detA +=((matrizXT[0][2]*matrizXT[1][1]*matrizXT[2][0]*-1)-(matrizXT[0][0]*matrizXT[1][2]*matrizXT[2][1])-(matrizXT[0][1]*matrizXT[1][0]*matrizXT[2][2]));
    }

    public void MatrizInversa(){
        matrizI[0][0]=((matrizXT[1][1]*matrizXT[2][2])-(matrizXT[2][1]*matrizXT[1][2]));
        matrizI[1][0]=((matrizXT[0][1]*matrizXT[2][2])-(matrizXT[2][0]*matrizXT[1][2]));
        matrizI[2][0]=((matrizXT[1][0]*matrizXT[2][1])-(matrizXT[2][0]*matrizXT[1][1]));
        matrizI[0][1]=((matrizXT[0][1]*matrizXT[2][2])-(matrizXT[2][1]*matrizXT[0][2]));
        matrizI[1][1]=((matrizXT[0][0]*matrizXT[2][2])-(matrizXT[2][0]*matrizXT[0][2]));
        matrizI[2][1]=((matrizXT[0][0]*matrizXT[2][1])-(matrizXT[2][0]*matrizXT[0][1]));
        matrizI[0][2]=((matrizXT[0][1]*matrizXT[1][2])-(matrizXT[1][1]*matrizXT[0][2]));
        matrizI[1][2]=((matrizXT[0][0]*matrizXT[1][2])-(matrizXT[1][0]*matrizXT[0][2]));
        matrizI[2][2]=((matrizXT[0][0]*matrizXT[1][1])-(matrizXT[1][0]*matrizXT[0][1]));

        matrizI[0][1]*=-1;
        matrizI[1][0]*=-1;
        matrizI[2][1]*=-1;
        matrizI[1][2]*=-1;

        matrizI[0][0]/=detA;
        matrizI[1][0]/=detA;
        matrizI[2][0]/=detA;
        matrizI[0][1]/=detA;
        matrizI[1][1]/=detA;
        matrizI[2][1]/=detA;
        matrizI[0][2]/=detA;
        matrizI[1][2]/=detA;
        matrizI[2][2]/=detA;

        System.out.println("\nMatriz Inverza de MatrizXT:");
        for (int i = 0; i<3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrizI[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void Betas(){
        for (int i = 0; i<3; i++){
            arreglob[0] += matrizI[0][i] * arregloX[i];
            arreglob[1] += matrizI[1][i] * arregloX[i];
            arreglob[2] += matrizI[2][i] * arregloX[i];
        }

        System.out.println("");
        for (int i = 0; i<3; i++){
            System.out.println("B" + i + " = " + arreglob[i]);
        }
    }

    public void FactoresEx(){
        System.out.println("\nCalculondo Y con respecto a Y=b0+b1*x1+b2*x2");
        System.out.println("Factor 1 | Factor 2 | Y");
        System.out.println("---------|----------|--------------------");
        for (int i=0; i<6; i++){
            arregloYEX[i] = arreglob[0]+arreglob[1]*arregloF1[i]+arreglob[2]*arregloF2[i];
            System.out.println(arregloF1[i]+"     | "+arregloF2[i]+"     | "+arregloYEX[i]);
        }
    }
}