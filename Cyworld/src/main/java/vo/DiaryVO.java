package vo;

import org.springframework.web.multipart.MultipartFile;

public class DiaryVO {

private String DiaryTopCategory,DiaryMiddleCategory,DiaryContent,DiaryRegdate,DiaryCommentName,DiaryCommentRegdate,DiaryCommentContent;
public String getDiaryTopCategory() {
	return DiaryTopCategory;
}
public void setDiaryTopCategory(String diaryTopCategory) {
	DiaryTopCategory = diaryTopCategory;
}
public String getDiaryMiddleCategory() {
	return DiaryMiddleCategory;
}
public void setDiaryMiddleCategory(String diaryMiddleCategory) {
	DiaryMiddleCategory = diaryMiddleCategory;
}
public String getDiaryContent() {
	return DiaryContent;
}
public void setDiaryContent(String diaryContent) {
	DiaryContent = diaryContent;
}
public String getDiaryRegdate() {
	return DiaryRegdate;
}
public void setDiaryRegdate(String diaryRegdate) {
	DiaryRegdate = diaryRegdate;
}
public String getDiaryCommentName() {
	return DiaryCommentName;
}
public void setDiaryCommentName(String diaryCommentName) {
	DiaryCommentName = diaryCommentName;
}
public String getDiaryCommentRegdate() {
	return DiaryCommentRegdate;
}
public void setDiaryCommentRegdate(String diaryCommentRegdate) {
	DiaryCommentRegdate = diaryCommentRegdate;
}
public String getDiaryCommentContent() {
	return DiaryCommentContent;
}
public void setDiaryCommentContent(String diaryCommentContent) {
	DiaryCommentContent = diaryCommentContent;
}
public int getDiaryLike() {
	return DiaryLike;
}
public void setDiaryLike(int diaryLike) {
	DiaryLike = diaryLike;
}
public int getDiaryFolderRef() {
	return DiaryFolderRef;
}
public void setDiaryFolderRef(int diaryFolderRef) {
	DiaryFolderRef = diaryFolderRef;
}
public int getDiaryFolderStep() {
	return DiaryFolderStep;
}
public void setDiaryFolderStep(int diaryFolderStep) {
	DiaryFolderStep = diaryFolderStep;
}
public int getDiaryFolderDepth() {
	return DiaryFolderDepth;
}
public void setDiaryFolderDepth(int diaryFolderDepth) {
	DiaryFolderDepth = diaryFolderDepth;
}
public int getDiaryContentRef() {
	return DiaryContentRef;
}
public void setDiaryContentRef(int diaryContentRef) {
	DiaryContentRef = diaryContentRef;
}
public int getDiaryCommentRef() {
	return DiaryCommentRef;
}
public void setDiaryCommentRef(int diaryCommentRef) {
	DiaryCommentRef = diaryCommentRef;
}
public int getDiaryCommentStep() {
	return DiaryCommentStep;
}
public void setDiaryCommentStep(int diaryCommentStep) {
	DiaryCommentStep = diaryCommentStep;
}
private int DiaryLike,DiaryFolderRef,DiaryFolderStep,DiaryFolderDepth,DiaryContentRef,DiaryCommentRef,DiaryCommentStep;
	
	
}
