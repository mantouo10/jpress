package io.jpress.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseComment<M extends BaseComment<M>> extends JbootModel<M> implements IBean {

    public static final String ACTION_ADD = "BaseComment:add";
    public static final String ACTION_DELETE = "BaseComment:delete";
    public static final String ACTION_UPDATE = "BaseComment:update";


    @Override
    protected String addAction() {
        return ACTION_ADD;
    }

    @Override
    protected String deleteAction() {
        return ACTION_DELETE;
    }

    @Override
    protected String updateAction() {
        return ACTION_UPDATE;
    }


	public void setId(java.math.BigInteger id) {
		set("id", id);
	}
	
	public java.math.BigInteger getId() {
		return get("id");
	}

	public void setParentId(java.math.BigInteger parentId) {
		set("parent_id", parentId);
	}
	
	public java.math.BigInteger getParentId() {
		return get("parent_id");
	}

	public void setContentId(java.math.BigInteger contentId) {
		set("content_id", contentId);
	}
	
	public java.math.BigInteger getContentId() {
		return get("content_id");
	}

	public void setContentModule(java.lang.String contentModule) {
		set("content_module", contentModule);
	}
	
	public java.lang.String getContentModule() {
		return getStr("content_module");
	}

	public void setContentUserId(java.lang.Integer contentUserId) {
		set("content_user_id", contentUserId);
	}
	
	public java.lang.Integer getContentUserId() {
		return getInt("content_user_id");
	}

	public void setCommentCount(java.lang.Long commentCount) {
		set("comment_count", commentCount);
	}
	
	public java.lang.Long getCommentCount() {
		return getLong("comment_count");
	}

	public void setOrderNumber(java.lang.Long orderNumber) {
		set("order_number", orderNumber);
	}
	
	public java.lang.Long getOrderNumber() {
		return getLong("order_number");
	}

	public void setUserId(java.math.BigInteger userId) {
		set("user_id", userId);
	}
	
	public java.math.BigInteger getUserId() {
		return get("user_id");
	}

	public void setIp(java.lang.String ip) {
		set("ip", ip);
	}
	
	public java.lang.String getIp() {
		return getStr("ip");
	}

	public void setAuthor(java.lang.String author) {
		set("author", author);
	}
	
	public java.lang.String getAuthor() {
		return getStr("author");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}

	public void setText(java.lang.String text) {
		set("text", text);
	}
	
	public java.lang.String getText() {
		return getStr("text");
	}

	public void setAgent(java.lang.String agent) {
		set("agent", agent);
	}
	
	public java.lang.String getAgent() {
		return getStr("agent");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

	public void setSlug(java.lang.String slug) {
		set("slug", slug);
	}
	
	public java.lang.String getSlug() {
		return getStr("slug");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}
	
	public java.lang.String getEmail() {
		return getStr("email");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}
	
	public java.lang.String getStatus() {
		return getStr("status");
	}

	public void setVoteUp(java.lang.Long voteUp) {
		set("vote_up", voteUp);
	}
	
	public java.lang.Long getVoteUp() {
		return getLong("vote_up");
	}

	public void setVoteDown(java.lang.Long voteDown) {
		set("vote_down", voteDown);
	}
	
	public java.lang.Long getVoteDown() {
		return getLong("vote_down");
	}

	public void setFlag(java.lang.String flag) {
		set("flag", flag);
	}
	
	public java.lang.String getFlag() {
		return getStr("flag");
	}

	public void setLat(java.math.BigDecimal lat) {
		set("lat", lat);
	}
	
	public java.math.BigDecimal getLat() {
		return get("lat");
	}

	public void setLng(java.math.BigDecimal lng) {
		set("lng", lng);
	}
	
	public java.math.BigDecimal getLng() {
		return get("lng");
	}

}
