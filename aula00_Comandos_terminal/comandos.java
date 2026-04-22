// ====================================================================
// GUIA DEFINITIVO DE COMANDOS DE TERMINAL JAVA
// ====================================================================

// --------------------------------------------------------------------
// 1. CÓDIGOS SEM PACOTE (Arquivos soltos, sem a linha "package nome;")
// Regra: Execute estes comandos DENTRO da pasta onde está o arquivo.
// --------------------------------------------------------------------

// Compilar apenas UM arquivo:
// javac NomeDoArquivo.java

// Compilar TODOS os arquivos da pasta de uma só vez:
// javac *.java

// Rodar o arquivo principal (NUNCA coloque .java ou .class aqui):
// java NomeDaClassePrincipal


// --------------------------------------------------------------------
// 2. CÓDIGOS COM PACOTE (Com a linha "package nome;" na linha 1)
// Regra: Execute estes comandos na RAIZ do projeto (fora da pasta).
// --------------------------------------------------------------------

// Compilar UM arquivo específico dentro do pacote:
// javac NomeDaPasta\NomeDoArquivo.java

// Compilar TODOS os arquivos de um pacote de uma vez (Exemplo do SJF):
// javac NomeDaPasta\*.java

// Rodar o programa (Use PONTO para separar Pacote.Classe):
// java NomeDaPasta.NomeDaClassePrincipal


// --------------------------------------------------------------------
// 3. UTILIDADES EXTRAS DO TERMINAL (Windows CMD)
// --------------------------------------------------------------------

// Entrar em uma pasta:
// cd NomeDaPasta

// Voltar uma pasta para trás:
// cd ..

// Limpar a tela do terminal (Ótimo para usar antes de rodar o programa):
// cls

// Criar um arquivo vazio pelo CMD:
// type NUL > NomeDoArquivo.java