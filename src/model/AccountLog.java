package model;

import java.io.Serializable;

public class AccountLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8463828550907782423L;
	private Integer AL_ID;//账户日志编号
	private String AL_ACTION;//账户日志操作
	private String AL_ACTION_CONTENT;//账户日志操作内容
	private String AL_CREATED_DATE;//账户日志操作日期
	private String AL_CREATED_NAME;//账户日志操作人名
    private String AL_TYPE;//账户日志类别
	/**
	 * @return the aL_ID
	 */
	public final Integer getAL_ID() {
		return AL_ID;
	}
	/**
	 * @param aL_ID 
	 *           the aL_ID to set
	 */
	public final void setAL_ID(Integer aL_ID) {
		AL_ID = aL_ID;
	}
	/**
	 * @return the aL_ACTION
	 */
	public final String getAL_ACTION() {
		return AL_ACTION;
	}
	/**
	 * @param aL_ACTION 
	 *           the aL_ACTION to set
	 */
	public final void setAL_ACTION(String aL_ACTION) {
		AL_ACTION = aL_ACTION;
	}
	/**
	 * @return the aL_ACTION_CONTENT
	 */
	public final String getAL_ACTION_CONTENT() {
		return AL_ACTION_CONTENT;
	}
	/**
	 * @param aL_ACTION_CONTENT 
	 *           the aL_ACTION_CONTENT to set
	 */
	public final void setAL_ACTION_CONTENT(String aL_ACTION_CONTENT) {
		AL_ACTION_CONTENT = aL_ACTION_CONTENT;
	}
	/**
	 * @return the aL_CREATED_DATE
	 */
	public final String getAL_CREATED_DATE() {
		return AL_CREATED_DATE;
	}
	/**
	 * @param aL_CREATED_DATE 
	 *           the aL_CREATED_DATE to set
	 */
	public final void setAL_CREATED_DATE(String aL_CREATED_DATE) {
		AL_CREATED_DATE = aL_CREATED_DATE;
	}
	/**
	 * @return the aL_CREATED_NAME
	 */
	public final String getAL_CREATED_NAME() {
		return AL_CREATED_NAME;
	}
	/**
	 * @param aL_CREATED_NAME 
	 *           the aL_CREATED_NAME to set
	 */
	public final void setAL_CREATED_NAME(String aL_CREATED_NAME) {
		AL_CREATED_NAME = aL_CREATED_NAME;
	}
	/**
	 * @return the aL_TYPE
	 */
	public final String getAL_TYPE() {
		return AL_TYPE;
	}
	/**
	 * @param aL_TYPE 
	 *           the aL_TYPE to set
	 */
	public final void setAL_TYPE(String aL_TYPE) {
		AL_TYPE = aL_TYPE;
	}
	/**
	 * @return the serialversionuid
	 */
	public static final long getSerialversionuid() {
		return serialVersionUID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountLog [AL_ID=" + AL_ID + ", AL_ACTION=" + AL_ACTION + ", AL_ACTION_CONTENT=" + AL_ACTION_CONTENT
				+ ", AL_CREATED_DATE=" + AL_CREATED_DATE + ", AL_CREATED_NAME=" + AL_CREATED_NAME + ", AL_TYPE="
				+ AL_TYPE + "]";
	}
    
    
}
