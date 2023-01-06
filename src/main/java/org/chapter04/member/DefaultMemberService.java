package org.chapter04.member;


import java.util.Arrays;

/**
 * public 이냐 package private 일까?
 */
class DefaultMemberService implements MemberService {

  private String member;

  private static class PrivateStaticClass {
    //왜 static 일까? 어떤 차이일까?
    /**
     * 남이나 마찬기지임, 아무런 외부클래스에 대해 참조하는게 없어
     */
    //자기 자신을 감싸는 필드에 접근이 불가능
    //감싸는 쪾에서만 내부클래스를 사용한다. 이 경우엔 Static class를 사용하는게 적절함ㅁ
  }

  private class PrivateClass {
    //아무렇지 않게 자기 자신을 감싸는 필드에 접근이 가능
    void doPrint() {
      System.out.println(member);
    }
  }

  public static void main(String[] args) {
    Arrays.stream(PrivateClass.class.getDeclaredFields()).forEach(System.out::println);
  }


}
