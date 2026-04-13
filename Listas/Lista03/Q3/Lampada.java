/*3. Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desli- 
gado) e os métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua 
um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso 
contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para 
isso, utilize uma instância da classe Contador criada anteriormente e implemente a ló- 
gica necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre 
as capacidades da classe criada. */

public class Lampada {
   private boolean estadoDaLampada;
   private Contador contador1;

   public Lampada(){
        this.estadoDaLampada = false;
        this.contador1 = new Contador();
   }

  

   public void acende(){
    this.estadoDaLampada = true;
    contador1.incrementa();
   }

   public void apaga(){
    this.estadoDaLampada = false;
   }


   public void mostraEstado(){

    if ( this.estadoDaLampada == true) {
        System.out.println("Lampada acesa");
    } else{
       System.out.println("Lampada apagada");
    }
   }

   public void quantLampAcesa(){
    contador1.imprime();
   }

   public boolean estaLigada() {
    return this.estadoDaLampada;
   }

}
