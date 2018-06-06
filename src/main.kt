//import java.nio.file.Paths
//import java.io.File
import fileStructure.*
import cnabImporter.*


fun main(args : Array<String>){
    println("Hello")


    var cnab = cnabFromTextFactory("teste.txt")

    cnab.constructHeader()

    println("Codigo banco: " + cnab.cnabHeader.codigoBancoCompensacao)
    println("Lote de registro: " + cnab.cnabHeader.loteServico)
    println("Tipo registro: " + cnab.cnabHeader.tipoRegistro)





}



//data class teste(var nome : String, var idade : Int){} //modelo que o grupo decidio dos modelos. Os atributos sao publicos

//teste de construcao de Trailer. OK!
//    var cnab = cnabFromTextFactory("teste.txt")
//    cnab.constructTrailer()
//    println("Banco: " + cnab.cnabTrailer.condigoBancoCompensacao)
//    println("Lote: " + cnab.cnabTrailer.loteServico)
//    println("Registro: " + cnab.cnabTrailer.tipoRegistro)
//    println("Quantidade de lotes: " + cnab.cnabTrailer.quantidadeLotes)
//    println("Quantidade de registros: " + cnab.cnabTrailer.quantidadeRegistros)
//    println("Quantidade de contas: " + cnab.cnabTrailer.quantidadeContasConciliadas)
//OBS: Tinha tornado tudo publico pra poder dar print


//Como manipular aquivos abaixo!
//    var caminho = Paths.get("").toAbsolutePath().toString()
//    var arquivo = File("teste.txt") //abre o arquivo
//    arquivo.writeText("escrevendo no arquivo\noi\n123")
//    arquivo.appendText("Mais texto no arquivo\nfim")
//    var conteudo = arquivo.readLines()        //converte o arquivo em um array onde cada indice e uma linha do mesmo
//    for(line in conteudo)
//        println(line)


//exemplo do trailer de um arquivo abaixo!
//    val l = "00199999         000001000014000000                                                                                                                                                            00000000000000000000000000000                    "
//
//    println("tamanho: " + l.length.toString()) //realmente tem 240 bytes
