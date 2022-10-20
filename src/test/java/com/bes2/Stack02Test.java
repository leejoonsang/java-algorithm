package com.bes2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    @BeforeEach
    void setUp(){
        // ex) DB에서 데이터 지우는 코드
        // ex) DB에 데이터 넣는 코드
        System.out.println("before each");
    }

    @Test
    @DisplayName("push worked")
    void push(){
        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);
        Integer[] arr = stack02.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    void pushAndPop() {
        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);
        assertEquals(20, stack02.pop());
        assertEquals(10, stack02.pop());
        // stack이 비어있을 때 pop을 하면?
        // Exception 예외 검증
        assertThrows(RuntimeException.class, ()->{
            stack02.pop();
        });

    }

    @Test
    void isEmpty() {
        Stack02 stack02 = new Stack02();
        assertTrue(stack02.isEmpty());
        stack02.push(19);
        assertFalse(stack02.isEmpty());
        stack02.pop();
        assertTrue(stack02.isEmpty());
    }

    @Test
    void realStack(){
        Stack<Integer> stack = new Stack<>();
        // Exception 예외 검증
        assertThrows(RuntimeException.class, ()->{
            stack.pop();
        });
    }

}