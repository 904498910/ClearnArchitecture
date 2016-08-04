package com.fly.mvpcleanarchitecture.ui.adapter;

import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * List Adapter的基类
 * @author 12072616
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class BaseListAdapter<T> extends BaseAdapter {
    /**
     * 是否为批量操作方式
     */
    protected boolean isActionMode = false;
    /**
     * 数据List
     */
    protected final List<T> list;
    /**
     * 选中Item的position
     */
    protected Set<T> checkedItemInfos;

    public BaseListAdapter() {
        super();
        this.list = new ArrayList<T>();
        this.checkedItemInfos = new LinkedHashSet<T>();
    }

    public boolean addAll(List<? extends T> list) {
        return this.list.addAll(list);
    }

    public void clear() {
        if (list != null) {
            this.list.clear();
        }
    }

    public void setSeclectItem(int position) {
        if (checkedItemInfos.contains(getItem(position))) {
            checkedItemInfos.remove(getItem(position));
        } else {
            checkedItemInfos.add(getItem(position));
        }
    }

    /**
     * 清空选中文件位置列表
     * 
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public void clearCheckedList() {
        checkedItemInfos.clear();
    }

    public boolean isSelected(int position) {
        if (position >= getList().size()) {
            return false;
        }
        return checkedItemInfos.contains(getItem(position));
    }

    public Set<T> getCheckedItemInfos() {
        return checkedItemInfos;
    }

    public int getCount() {
        return list == null ? 0 : list.size();
    }

    public T getItem(int i) {
        return this.list.get(i);
    }

    public long getItemId(int id) {
        return id;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isEmpty() {
        return list == null ? true : list.isEmpty();
    }

    public T remove(int i) {
        return list.remove(i);
    }

    public void addItem(T t) {
        this.list.add(t);
    }

    public List<T> getList() {
        return list;
    }

    public boolean isActionMode() {
        return isActionMode;
    }

    public void setActionMode(boolean isActionMode) {
        this.isActionMode = isActionMode;
    }
}
