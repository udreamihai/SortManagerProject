package com.spartaglobal.sortmanagerproject.junit;

public class SortController {
    public String initiateSort(String desiredSortType){
        Sorter s = getSort(desiredSortType);
        System.out.printf("Initiated sort type: %s\n", s.toString());
        return s.toString();
    }

    private Sorter getSort(String desiredSortType) {
        SortFactory sf;
        System.out.printf("Here's the sorter with sort type %s\n", desiredSortType);
        if (desiredSortType.equals("Bubble")){
            sf = new BubbleSortFactory();
        }
        else if (desiredSortType.equals("Merge")){
            sf = new MergeSortFactory();
        }
        else
            sf = new MergeSortFactory();
        return sf.getInstance();
    }

}
