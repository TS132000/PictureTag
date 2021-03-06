package com.debugTeam.dao;

import com.debugTeam.entity.Project;

import java.util.ArrayList;

/**
 * @Author: Cauchy-Ny
 * @Description:
 * @Data: Create in 11:58 2018/4/1
 * @Modified By:
 */
public interface ProjectDao {

    /**
     * 新建一个项目
     * @param project 项目类
     * @return 是否成功
     */
    public boolean startNewProject(Project project);

    /**
     * 选择关闭一个项目
     * @param id 项目id
     * @return 是否成功
     */
    public boolean closeExistedProject(String id);

    /**
     * 根据id获取项目
     * @param id 项目id
     * @return 项目
     */
    public Project getProject(String id);

    /**
     * 获取全部的项目
     * @return 所有项目列表
     */
    public ArrayList<Project> getAllProjects();

    /**
     * 标记者选择开启一个新项目
     * @param phoneNum 标记者手机号
     * @param id 项目编号
     * @return 返回选择是否成功，若项目满人则失败
     */
    public boolean startNewJob(String phoneNum, String id);

    /**
     * 踢出一个项目成员
     * @param phoneNum 标记者手机号
     * @param id 项目编号
     * @return 返回选择是否成功，若该人不在项目中则失败
     */
    public boolean kickOut(String phoneNum, String id);

    /**
     * 计算当前接取该项目应该有多少分成
     * @param id 项目编号
     * @return 当前接取项目的分成
     */
    public double calculateCurrentCut(String id);

    /**
     * 更新项目信息
     * @param project
     * @return 返回是否成功
     */
    public boolean updateProject(Project project);

}
