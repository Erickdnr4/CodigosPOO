from abc import ABCMeta


class Ecuacion(ABCMeta):

    # Metodo de clase
    @staticmethod
    def calcularIncognitas(coeficienteA, coeficienteB, terminoIndependienteC, coeficienteD, coeficienteE,
                           terminoIndependienteF):
        determinante = coeficienteA * coeficienteE - coeficienteB * coeficienteD
        variableX = coeficienteE * terminoIndependienteC - coeficienteB * terminoIndependienteF / determinante
        variableX = round(variableX, 2)
        variableY = coeficienteA * terminoIndependienteF - coeficienteD * terminoIndependienteC / determinante
        variableY = round(variableY, 2)
        return [variableX, variableY]


class pruebaArchivos:

    def leerArchivo(self, archivo):
        file = open(archivo, 'r')
        lineas = []
        lineas_archivo = []
        for linea in file.readlines():
            lineas.append(linea.replace('\n', '').split(";"))
        file.close()
        for f in range(0, len(lineas)):
            try:
                lineas_archivo.append(
                    [int(lineas[f][0]), int(lineas[f][1]), int(lineas[f][2]), int(lineas[f][3]), int(lineas[f][4]),
                     int(lineas[f][5])])
            except ValueError:
                lineas_archivo.append([0, 0, 0, 0, 0, 0])
        return lineas_archivo

    def Variables(self, lista):
        resultados = []
        for f in range(0, len(lista)):
            resultados.append(Ecuacion.calcularIncognitas(
                lista[f][0], lista[f][1], lista[f][2], lista[f][3], lista[f][4], lista[f][5]))
        return resultados

    def guardarResultados(self, entrada, resultados):
        file = open("resultados.txt", 'w')
        file.write('CoeficienteA;CoeficienteB;TerminoIndependienteC;CoeficienteD;CoeficienteE;TerminoIndependienteF;'
                   ' VariableX; VariableY\n')
        for f in range(0, len(entrada)):
            linea = str(entrada[f][0]) + ';' + str(entrada[f][1]) + ';' + str(entrada[f][2]) + ';' + str(
                entrada[f][3]) + ';' + str(entrada[f][4]) + ';' + str(entrada[f][5]) + ';' + str(resultados[f][0]) + ';'+ \
                str(resultados[f][1]) + '\n'
            file.write(linea)
        file.close()


if __name__ == "__main__":
    prueba = pruebaArchivos()
    archivo = []
    archivo = prueba.leerArchivo("datos.txt")
    resultado = prueba.Variables(archivo)
    prueba.guardarResultados(archivo, resultado)
