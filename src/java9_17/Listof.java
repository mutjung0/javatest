package java9_17;

import java.util.List;

public class Listof {
    public static void main(String[] args) {
        var animalList = List.of("cow", "elephant", "elephant");
        System.out.println(animalList);
        // 요소를 추가하거나 제거할 수 없습니다.
        animalList.add("rabbit"); // 불변 객체가 수정됩니다. Exception
        System.out.println(animalList);



        /*
Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
	at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
	at _2_collection_factory_methods.Listof.main(_2_collection_factory_methods.Listof.java:7)
         */
    }
}
