package com.lierlin.utils;

import com.github.pagehelper.PageSerializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageInfo<T> extends PageSerializable<T> {
    //��ǰҳ
    private int pageNum;
    //ÿҳ������
    private int pageSize;
    //��ǰҳ������
    private int size;

    //����startRow��endRow�����ã�����˵��������÷�
    //������ҳ����"��ʾstartRow��endRow ��size������"

    //��ǰҳ���һ��Ԫ�������ݿ��е��к�
    private int startRow;
    //��ǰҳ�����һ��Ԫ�������ݿ��е��к�
    private int endRow;
    //��ҳ��
    private int pages;

    //ǰһҳ
    private int prePage;
    //��һҳ
    private int nextPage;

    //�Ƿ�Ϊ��һҳ
    private boolean isFirstPage = false;
    //�Ƿ�Ϊ���һҳ
    private boolean isLastPage = false;
    //�Ƿ���ǰһҳ
    private boolean hasPreviousPage = false;
    //�Ƿ�����һҳ
    private boolean hasNextPage = false;
    //����ҳ����
    private int navigatePages;
    //���е���ҳ��
    private int[] navigatepageNums;
    //�������ϵĵ�һҳ
    private int navigateFirstPage;
    //�������ϵ����һҳ
    private int navigateLastPage;
}