package br.rtomokane.reflaction;

import br.rtomokane.annotation.PrimeiraAnotacao;
import br.rtomokane.entity.ClasseComAnotacao;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;


public class AppReflaction {
    public static void main(String[] args) throws Exception {
        Class cs = ClasseComAnotacao.class;

        Constructor constructor = cs.getConstructor();
        ClasseComAnotacao entity = (ClasseComAnotacao) constructor.newInstance();

        Annotation[] annotations = entity.getClass().getAnnotations();
        for (Annotation annotation: annotations){
            System.out.println(annotation.toString());
        }
    }
}

