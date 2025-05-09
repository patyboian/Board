package dio.board.persistence.entity;

import java.util.stream.Stream;

public enum BoardColumnKindEnum {

    INITIAL, FINAL, CANCEL, PENDING;

    // passamos todos os parametros acima para a variavel Stram
    // pra que possamos fazer a validação
    public static BoardColumnKindEnum findByName(final String name){
        return Stream.of(BoardColumnKindEnum.values())
                .filter(b -> b.name().equals(name))
                .findFirst().orElseThrow();
    }
}
