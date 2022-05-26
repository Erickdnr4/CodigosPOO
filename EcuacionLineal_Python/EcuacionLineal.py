from abc import abstractmethod
from abc import ABCMeta


class EcuacionLineal(ABCMeta):


    @staticmethod
    def calcularValorDeX(coeficienteA, coeficienteB, terminoIndependienteC,
                         coeficienteD, coeficienteE, terminoIndependienteF):
        determinante = coeficienteA * coeficienteE - coeficienteB * coeficienteD
        variableX = coeficienteE * terminoIndependienteC - coeficienteB * terminoIndependienteF / determinante
        return variableX

    @staticmethod
    def calcularValorDeY(coeficienteA, coeficienteB, terminoIndependienteC,
                         coeficienteD, coeficienteE, terminoIndependienteF):
        determinante = coeficienteA * coeficienteE - coeficienteB * coeficienteD
        variableY = coeficienteA * terminoIndependienteF - coeficienteD * terminoIndependienteC / determinante
        return variableY



