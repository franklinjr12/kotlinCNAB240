package cnabImporter

import fileStructure.*
import java.io.File

class cnabFromTextFactory{

    private var cnabTrailer : Trailer
    private var cnabHeader : Header
    private var caminhoArquivo : File
    private var arquivo : List<String>

    constructor(fileName : String) {
        this.cnabTrailer = Trailer()
        this.cnabHeader = Header()
        this.caminhoArquivo = File(fileName) //abre o aquivo
        this.arquivo = caminhoArquivo.readLines() //passa o contudo do arquivo para a variavel

        if(validateLines() != "Linhas OK")
            println("Deu ruim aqui") //tem que colocar um try catch aqui
    }


    private fun validateLines() : String{
        for(line in arquivo)
            if(!(line.length <= 240 && line.length > 0))
                return "Tamanho da linha fora do esperado"

        return "Linhas OK"
    }

    fun constructTrailer(){
        var ultimaLinha = arquivo[arquivo.lastIndex]

        //todo PEGAR OS DADOS EM SUAS POSICOES E CONSTRUIR O TRAILER
        
    }


    fun constructHeader(){

    }

}