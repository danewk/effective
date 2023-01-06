package org.chapter04.item;

import static org.junit.jupiter.api.Assertions.*;

import org.chapter04.member.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ItemServiceTest {

  @Mock
  MemberService memberService;

  @Test
  void itemService(){

    /**
     * defaultMemberService를 사용받지못함, 패키지가 다르면 사용하지 않도록 결정하고 선언했기 때문에!
     * 테스트 코드에서 쓰지 못하는게 당연한 것이다.
     */
    //Mock 하지 않아도 되긴 함,
    ItemService itemService = new ItemService(memberService);
    assertNotNull(itemService);
    //assertNotNull(itemService.memberService); //package-private를 사용하면 같은 패키지 구조를 가지기 때문에, 접근할 수 있다.
    //assertNotNull(itemService.getValue()); //package-private를 사용한 getter를 사용, 같은 패키지 구조를 가지기 때문에, 접근할 수 있다.
  }

  @Test
  void itemService2(){

    /**
     * defaultMemberService를 사용받지못함, 패키지가 다르면 사용하지 않도록 결정하고 선언했기 때문에!
     * 테스트 코드에서 쓰지 못하는게 당연한 것이다.
     */
    //Mock 하지 않아도 되긴 함,
    ItemService itemService = new ItemService(memberService);
    assertNotNull(itemService);
    assertNotNull(itemService.getMemberService()); //package-private를 사용한 getter를 사용, 같은 패키지 구조를 가지기 때문에, 접근할 수 있다.
    assertNotNull(itemService.getValue()); //package-private를 사용한 getter를 사용, 같은 패키지 구조를 가지기 때문에, 접근할 수 있다.
  }

  @Test
  void 테스트(){
    int a = 10;
    int b = 5;
    Assertions.assertEquals(15, a+ b);
  }
}