package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    //
    void testNewRoom(){
        //Entrada de dados - Massa
        int numberRoom  = 200;
        String nameRoom = "Suíte Luxo";
        double valuedaily = 500;

        //T - Teste - Execução do teste
        Room roomluxury = new Room(numberRoom, nameRoom, valuedaily);

        //R - Resultado - Validação de Resultados
        assertEquals(numberRoom, roomluxury.getId());
        assertEquals(nameRoom, roomluxury.getName());
        assertEquals(valuedaily, roomluxury.pricePerDay);
        //R - Resultado - Validação de Resultados - com erro
        //assertEquals(550, roomluxury.pricePerDay);
    }
    
}
