package com.zjg.blog.dto.admin;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class AdminArticleComment {
    /**
     *  管理评论bean
     *  update 2020年4月4日13:26:26
     *  author zjg
     */
    private long id;
    private long parentId;      //一级留言id
    private long articleId;
    private String articleTitle;//文章标题
    private long userId;        //评论人id
    private String username;    //回复人昵称
    private String targetUsername;  //被回复人昵称
    private String source;          //平台
    private boolean effective;      //是否有效
    private String content;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createBy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTargetUsername() {
        return targetUsername;
    }

    public void setTargetUsername(String targetUsername) {
        this.targetUsername = targetUsername;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isEffective() {
        return effective;
    }

    public void setEffective(boolean effective) {
        this.effective = effective;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }
}
