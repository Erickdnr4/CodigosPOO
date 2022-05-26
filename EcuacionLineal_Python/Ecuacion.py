"""
>>> Ecuacion = EcuacionLineal()
>>> Ecuacion.calcularEcuacionesLinealesConDosIncognitas(2, 1, 3, 4, 8, 6)
>>> Ecuacion.getDeterminante()
12
>>> Ecuacion.getVariableX()
23.5
>>> Ecuacion.getVariableY()
11.0
"""


class EcuacionLineal:
    __coeficienteA = float(0)
    __coeficienteB = float(0)
    __terminoIndependienteC = float(0)
    __coeficienteD = float(0)
    __coeficienteE = float(0)
    __terminoIndependienteF = float(0)
    __determinante = float(0)
    __variableX = float(0)
    __variableY = float(0)

    def calcularEcuacionesLinealesConDosIncognitas(self, coeficienteA, coeficienteB, terminoIndependienteC,
                                                   coeficienteD, coeficienteE, terminoIndependienteF):
        self.__coeficienteA = coeficienteA
        self.__coeficienteB = coeficienteB
        self.__terminoIndependienteC = terminoIndependienteC
        self.__coeficienteD = coeficienteD
        self.__coeficienteE = coeficienteE
        self.__terminoIndependienteF = terminoIndependienteF
        self.__determinante = self.__coeficienteA * self.__coeficienteE - self.__coeficienteB * self.__coeficienteD
        self.__variableX = self.__coeficienteE * self.__terminoIndependienteC - self.__coeficienteB * self.__terminoIndependienteF / self.__determinante
        self.__variableY = self.__coeficienteA * self.__terminoIndependienteF - self.__coeficienteD * self.__terminoIndependienteC / self.__determinante

    def getDeterminante(self):
        return self.__determinante

    def getVariableX(self):
        return self.__variableX

    def getVariableY(self):
        return self.__variableY


if __name__ == '__main__':
    import doctest

    doctest.testmod()