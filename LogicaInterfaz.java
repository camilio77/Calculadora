public class LogicaInterfaz {

    private double primerNumero;
    private String texto="0";
    private boolean nuevoNumero=true;
    private String operacion="";
    private Operaciones operacion2;


    public LogicaInterfaz(Operaciones operacion) {
        this.operacion2=operacion;
    }

    public String getTexto(){
        return texto;
    }

    public void addNumero(String numero){
        if(nuevoNumero == true){
            texto=numero;
            nuevoNumero=false;
        }else{
            if(texto.equals("0")){
                texto=numero;
            }else{
                texto+=numero;
            }
        }
    }

    public void addDecimal(){
        if(nuevoNumero == true){
            texto="0.";
            nuevoNumero=false;
            return;
        }else{
            if(!texto.contains(".")){
                texto+=".";
            }
        }
    }

    public void operacion(String operacion){
        try{
            primerNumero= Double.parseDouble(texto);
        }catch(NumberFormatException ex){
            texto="0";
            primerNumero=0;
        }
        this.operacion=operacion;
        nuevoNumero=true;
    }

    public void igual(){
        Double segundoNumero;
        if(operacion.isEmpty()){
            return;
        }
        try{
            segundoNumero= Double.parseDouble(texto);
        }catch(NumberFormatException ex){
            texto="0";
            operacion="";
            nuevoNumero=true;
            return;
        }

        double resultado=0;
        boolean error=false;

        switch(operacion){
            case "√":
                if(segundoNumero%2==0 && primerNumero<0){
                    error=true;
                    break;
                }else{
                    resultado=operacion2.raiz(primerNumero, segundoNumero);
                    break;
                }
            case "'":
                resultado=operacion2.potencia(primerNumero, segundoNumero);
                break;
            case "%":
                if(segundoNumero==0){
                    error=true;
                    break;
                }else{
                    resultado=operacion2.modulo(primerNumero, segundoNumero);
                    break;
                }
            case "/":
                if(segundoNumero==0){
                    error=true;
                    break;
                }else{
                    resultado=operacion2.division(primerNumero, segundoNumero);
                    break;
                }
            case "*":
                resultado=operacion2.multiplicar(primerNumero, segundoNumero);
                break;
            case "-":
                resultado=operacion2.restar(primerNumero, segundoNumero);
                break;
            case "+":
                resultado=operacion2.suma(primerNumero, segundoNumero);
                break;
        }
        if(error==true){
            texto="Error";
            nuevoNumero=true;
        }else{
            primerNumero=0;
            texto=String.valueOf(resultado);
            return;
        }
    }

    public void reinicio(){
        texto="0";
        operacion="";
        primerNumero=0;
        nuevoNumero=true;
    }

    public void borrar(){
        if(nuevoNumero==true){
            return;
        }
        if(texto.length()<=1){
            texto="0";
            nuevoNumero=true;
        }else{
            texto=texto.substring(0, texto.length()-1);
        }
    }
}
