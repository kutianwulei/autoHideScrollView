package com.chuck.autohidescrollview.view;

public interface ILoadingLayout {
	public void pullToRefresh();

	public void releaseToRefresh();

	public void refreshing();

	public void normal();
}