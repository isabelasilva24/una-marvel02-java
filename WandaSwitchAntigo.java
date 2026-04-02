
public class WandaSwitchAntigo {
public static void main(String[] args) {
String faseWanda = "WandaVision";
String status;

switch (faseWanda) {
case "Vingadora":
status = "Heroína em treinamento.";
break;

case "Wandavision":
status = "Criação do Hex e a vida suburbana.";

case "Feiticeira Escarlate":
status = "Domínio da Magia do Caos";
break;

default:
status = "Fase desconhecida.";
break;
}
System.out.println("Status: " + status);
}
}