###查询用户test1可以查看的页面（Sys_menu）
#####查询sql语句：
SELECT MenuName,MenuUrl，MenuID 
FROM sys_menu 
where MenuID in
(SELECT PrivilegeAccessKey 
FROM cf_privilege 
where PrivilegeMasterKey in
    (SELECT RoleID 
    FROM cf_role 
    where RoleID in
        (SELECT RoleID 
        FROM cf_userrole 
        where UserID in
            (SELECT UserID 
            FROM cf_user 
            where LoginName='test1')))
and PrivilegeAccess='Sys_Menu');
#####伪代码：
1、	根据名称在CF_User表中查找人员编号UserID
2、	根据人员编号UserID在CF_Userrole表中查找该人员所对应的角色编号RoleID
3、	根据角色编号RoleID在CF_Role表中查找该RoleID所对应的privilegemasterkey
4、	根据privilegemasterkey在CF_privilege表中查找该privilegemasterkey对应的MenuID并选取其中PrivilegeAccess='Sys_Menu'的MenuName，MenuID，MenuUrl
#####查询结果：![Sys_menu](/.jpg)
###对订单(order)页面中的操作权限(sys_button)
#####查询sql语句：
#####伪代码：
#####查询结果：![Sys_button](/.jpg)
