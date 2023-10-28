public class CalculadoraRank {
    String nome;
    int vitoria;
    int derrota;
    
   
   
    public CalculadoraRank(String nome, int vitoria, int derrota){
        this.nome = nome;
        this.vitoria = vitoria;
        this.derrota = derrota;

    }

    public int calcularRank(int vitoria, int derrota){
        
        int saldoVitoria;
        return  saldoVitoria = vitoria - derrota;
        
    }

    public String classificacao (int saldoVitoria){
         String nivel;
        
        if(saldoVitoria <= 10){
        return nivel = "Ferro";
         }else
            if(saldoVitoria <=20 ){
           return nivel = "Bronze";
            }else
                if(saldoVitoria <=50 ){
               return nivel = "Prata";
                }else
                    if(saldoVitoria <=80 ){
                   return nivel = "Ouro";
                     }else
                        if(saldoVitoria <=90 ){
                             return nivel = "Diamante";
                             }else
                                 if(saldoVitoria <=100 ){
                                    return nivel = "Lendário";
                                     }else
                                        if(saldoVitoria >=101 ){
                                           return nivel = "Imortal";
                                              }
    return "Valor inválido";
 
    }

}
