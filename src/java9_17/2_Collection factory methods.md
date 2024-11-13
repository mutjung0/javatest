### Collection factory methods
#### Theory
java 9

Java 9 saw the addition of convenient factory methods for collections. They are invoked directly from the interface. These are:

Java 9에는 컬렉션을 위한 편리한 팩토리 메소드가 추가되었습니다. 인터페이스에서 직접 호출됩니다. 이것들은 다음과 같습니다:

List.of(...);
Set.of(...);
Map.of(...);

They should be used whenever you work with compile-time constant expressions, like a list of items in a test.

테스트 항목 목록과 같은 컴파일 타임 상수 표현식으로 작업할 때마다 사용해야 합니다.

The collections created by these factory methods are immutable, i.e., you cannot add or remove elements. As an additional benefit, the various overloads are optimized. That means, if you return a list with exactly two arguments, the list will not use a backing array like Arrays.asList(), but really just use two fields for the two elements!

이러한 팩토리 메서드로 생성된 컬렉션은 변경할 수 없습니다. 즉, 요소를 추가하거나 제거할 수 없습니다. 추가적인 이점으로 다양한 과부하가 최적화됩니다. 즉, 정확히 두 개의 인수가 있는 목록을 반환하는 경우 목록은 Arrays.asList()와 같은 지원 배열을 사용하지 않고 실제로 두 요소에 대해 두 개의 필드를 사용합니다!

If you want to see it for yourself, check out the ImmutableCollections class in the JDK. It even optimizes to the empty List with List.of()! Gone are the days when you had to use different APIs (Arrays.asList(), Collections.emptyList(), Collections.singletonList()) in your code to achieve the same goal.

직접 보고 싶다면 JDK의 ImmutableCollections 클래스를 확인하세요. List.of()를 사용하여 빈 목록으로 최적화하기도 합니다! 동일한 목표를 달성하기 위해 코드에서 서로 다른 API(Arrays.asList(), Collections.emptyList(), Collections.singletonList())를 사용해야 했던 시절은 지나갔습니다.

Note that you cannot use ImmutableCollections yourself (as it is package private), only through the factory methods.

ImmutableCollections를 직접 사용할 수는 없으며(패키지 전용이므로) 팩토리 메서드를 통해서만 사용할 수 있습니다.

##### List.of(...)
List.of(...) creates an immutable list of its arguments.

List.of(...)는 불변의 인수 목록을 생성합니다.

##### Set.of(...)
Set.of(...) creates an immutable Set of its arguments.

It is a runtime error if you specify the same element twice. Use a regular HashSet if you don't know whether duplicates exist.

##### Map.of(...)
You can create a new Map with Map.of(...) by specifying alternating key-value pairs, e.g. Map.of(key1, value1, key2, value2).

Since it may be difficult to see which value belongs to which key, you can use the alternate Map.ofEntries(...), which takes Map.entry(...) elements.

##### List.copyOf(...)
List.copyOf(...) creates an immutable copy of a list. Note that this is more than just wrapping it with Collections.unmodifiableList(): it also copies the elements. A simple unmodifiable list still sees any changes made to the underlying list. That's why it's a good practice to make copies of incoming list arguments (at least if you don't trust the code calling you). List.copyOf(...) makes this pattern very easy.