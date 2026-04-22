/*
 * ==============================================================================
 * ANÁLISE DAS AFIRMAÇÕES SOBRE LÓGICA E SINTAXE (JAVA)
 * ==============================================================================
  
 
 * * 1. "O caso default é requerido na instrução de seleção switch."
 * -> FALSO. A cláusula 'default' é totalmente opcional. Se nenhum 'case' for 
 * atendido e não houver 'default', o programa simplesmente pula o bloco switch 
 * e continua a execução normalmente.
 
 * * 2. "A instrução break é requerida no último caso de uma instrução de seleção switch."
 * -> FALSO. O 'break' não é obrigatório no último caso. Como não há mais código 
 * abaixo dele dentro do switch, a instrução terminará naturalmente de qualquer 
 * forma (embora seja considerado uma boa prática colocá-lo).
 
 * * 3. "A expressão ((x > y) && (a < b)) é verdadeira se (x > y) for verdadeiro ou (a < b) for verdadeira."
 * -> FALSO. O operador '&&' representa o E lógico (AND). Para que a expressão 
 * seja verdadeira, AMBAS as condições precisam ser verdadeiras obrigatoriamente. 
 * A descrição da frase ("um ou outro") se refere ao operador '||' (OU lógico).
 
 * * 4. "Uma expressão contendo o operador || é verdadeira se um ou ambos de seus operandos forem verdadeiros."
 * -> VERDADEIRO. Essa é a regra exata do operador '||' (OU lógico / OR). Basta 
 * que pelo menos uma das partes seja verdadeira para que o resultado final seja 
 * verdadeiro.
 
 * * 5. "Para testar para uma série de valores em uma instrução switch, pode-se utilizar um hífen (-) entre os valores inicial e final da série em um rótulo case."
 * -> FALSO. Em Java (e nas linguagens baseadas em C), não se pode usar um hífen 
 * para intervalos (ex: case 1-5:). O compilador entenderia o hífen como uma 
 * subtração matemática. Para testar vários valores juntos, deve-se listar os 
 * casos um abaixo do outro.
 
 * * 6. "Listar casos consecutivamente sem instruções entre eles permite aos casos executar o mesmo conjunto de instruções."
 * -> VERDADEIRO. Esse comportamento é conhecido como 'fall-through'. Como não 
 * há uma instrução 'break' para interromper, a execução "cai" para o próximo 
 * caso até encontrar um break ou o fim do switch.
 * 
 * 
 * ==============================================================================
 */