package org.zzy.plusonelive.mvp.model.bean;


/**
 * 项目名称: PlusOneLivePull
 * 创建人: 周正一
 * 创建时间：2017/8/16
 */
public  class RecyclerViewHeaderBean {

    //封面
    private String cover;
    //用户头像
    private  String userAvatar;
    //用户昵称
    private  String nickName;
    //新消息通知
    private  String newMsg;


    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getNewMsg() {
        return newMsg;
    }

    public void setNewMsg(String newMsg) {
        this.newMsg = newMsg;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }
}