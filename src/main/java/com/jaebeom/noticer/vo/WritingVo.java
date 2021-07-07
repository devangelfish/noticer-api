package com.jaebeom.noticer.vo;

import lombok.Data;
import lombok.NonNull;

@Data
public class WritingVo {
	private @NonNull Long no;
	private @NonNull String title;
	private String contents;
}
