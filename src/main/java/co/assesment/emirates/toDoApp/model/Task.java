package co.assesment.emirates.toDoApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The Class Task.
 */
@Entity
public class Task {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** The checked. */
	@Column
	private boolean checked;
	
	/** The description. */
	@Column
	private String description;
	
	/** The priority. */
	@Column
	private String priority;
	
	/** The css. */
	@Column
	private String css;
	
	/** The create date. */
	@Column
	private String createDate;
	
	/** The status. */
	@Column
	private String status;
	
	/** The status css. */
	@Column
	private String statusCss;
	
	/** The completed on. */
	@Column
	private String completedOn;
	
	/** The completed css. */
	@Column
	private String completedCss;
	
	/** The completed date. */
	@Column
	private String completedDate;
	
	/** The disabled on completed. */
	@Column
	private String disabledOnCompleted;
	@Column
	private String completedTextCss;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Checks if is checked.
	 *
	 * @return true, if is checked
	 */
	public boolean isChecked() {
		return checked;
	}

	/**
	 * Sets the checked.
	 *
	 * @param checked
	 *            the new checked
	 */
	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *            the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the priority.
	 *
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * Sets the priority.
	 *
	 * @param priority
	 *            the new priority
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * Gets the css.
	 *
	 * @return the css
	 */
	public String getCss() {
		return css;
	}

	/**
	 * Sets the css.
	 *
	 * @param css
	 *            the new css
	 */
	public void setCss(String css) {
		this.css = css;
	}

	/**
	 * Gets the creates the date.
	 *
	 * @return the creates the date
	 */
	public String getCreateDate() {
		return createDate;
	}

	/**
	 * Sets the creates the date.
	 *
	 * @param createDate
	 *            the new creates the date
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status
	 *            the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the status css.
	 *
	 * @return the status css
	 */
	public String getStatusCss() {
		return statusCss;
	}

	/**
	 * Sets the status css.
	 *
	 * @param statusCss
	 *            the new status css
	 */
	public void setStatusCss(String statusCss) {
		this.statusCss = statusCss;
	}

	/**
	 * Gets the completed on.
	 *
	 * @return the completed on
	 */
	public String getCompletedOn() {
		return completedOn;
	}

	/**
	 * Sets the completed on.
	 *
	 * @param completedOn
	 *            the new completed on
	 */
	public void setCompletedOn(String completedOn) {
		this.completedOn = completedOn;
	}

	/**
	 * Gets the completed css.
	 *
	 * @return the completed css
	 */
	public String getCompletedCss() {
		return completedCss;
	}

	/**
	 * Sets the completed css.
	 *
	 * @param completedCss
	 *            the new completed css
	 */
	public void setCompletedCss(String completedCss) {
		this.completedCss = completedCss;
	}

	/**
	 * Gets the completed date.
	 *
	 * @return the completed date
	 */
	public String getCompletedDate() {
		return completedDate;
	}

	/**
	 * Sets the completed date.
	 *
	 * @param completedDate
	 *            the new completed date
	 */
	public void setCompletedDate(String completedDate) {
		this.completedDate = completedDate;
	}

	/**
	 * Gets the disabled on completed.
	 *
	 * @return the disabled on completed
	 */
	public String getDisabledOnCompleted() {
		return disabledOnCompleted;
	}

	/**
	 * Sets the disabled on completed.
	 *
	 * @param disabledOnCompleted
	 *            the new disabled on completed
	 */
	public void setDisabledOnCompleted(String disabledOnCompleted) {
		this.disabledOnCompleted = disabledOnCompleted;
	}
	
	

	public String getCompletedTextCss() {
		return completedTextCss;
	}

	public void setCompletedTextCss(String completedTextCss) {
		this.completedTextCss = completedTextCss;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Task [id=").append(id).append(", checked=").append(checked).append(", description=").append(description).append(", priority=")
				.append(priority).append(", css=").append(css).append(", createDate=").append(createDate).append(", status=").append(status)
				.append(", statusCss=").append(statusCss).append(", completedOn=").append(completedOn).append(", completedCss=").append(completedCss)
				.append(", completedDate=").append(completedDate).append(", disabledOnCompleted=").append(disabledOnCompleted)
				.append(", completedTextCss=").append(completedTextCss).append("]");
		return builder.toString();
	}
}
