package org.chapter04.item;

import org.chapter04.member.MemberService;

public class ItemService {

  /**
   * public class의 인스턴스 필드는 되도록 public이 아니여야 한다.
   */

  MemberService memberService;
  private String value;

  boolean onSale; //package-private

  protected int saleRate; // 공개할 경우 Protected, public

  public ItemService(MemberService memberService) {
    if(memberService == null){
      throw new IllegalArgumentException("MemberService should not be null");
    }
    this.memberService = memberService;
  } //밖에서 사용해야하는 애들은 생성자 같은 경우는 public 으로 제공중이다.

  String getValue() { //package-private로 선언
    return value;
  }

  MemberService getMemberService() {
    return memberService;
  }
}
