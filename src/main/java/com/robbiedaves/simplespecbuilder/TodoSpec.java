package com.robbiedaves.simplespecbuilder;

public class TodoSpec extends ApplicationSpec{


    private void buildTodoApp() {

        RequirementSpec toDoSpec = RequirementSpec.requirementsBuilder("TODO Application")
                .addAuthor("Robin Davies")
                .addDescription("My TODO application to manage tasks")
                .build();
        System.out.println(toDoSpec.getSpecString());
    }

    public static void main (String[] args) {
        TodoSpec todoSpec = new TodoSpec();
        todoSpec.buildTodoApp();
    }
}
