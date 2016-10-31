###查询用户test1可以查看的页面（Sys_menu）
#####查询sql语句：
SELECT MenuName,MenuUrl，MenuID<br/> 
FROM sys_menu <br/>
where MenuID in<br/>
(SELECT PrivilegeAccessKey <br/><br/><br/>
FROM cf_privilege <br/><br/><br/>
where PrivilegeMasterKey in<br/><br/><br/>
    (SELECT RoleID <br/><br/><br/>
    FROM cf_role <br/><br/><br/>
    where RoleID in<br/><br/><br/>
        (SELECT RoleID <br/><br/><br/>
        FROM cf_userrole <br/><br/><br/>
        where UserID in<br/><br/><br/>
            (SELECT UserID <br/><br/><br/>
            FROM cf_user <br/><br/><br/>
            where LoginName='test1')))<br/><br/><br/>
and PrivilegeAccess='Sys_Menu');<br/><br/>
#####伪代码：
1、	根据名称在CF_User表中查找人员编号UserID<br/>
2、	根据人员编号UserID在CF_Userrole表中查找该人员所对应的角色编号RoleID<br/>
3、	根据角色编号RoleID在CF_Role表中查找该RoleID所对应的privilegemasterkey<br/>
4、	根据privilegemasterkey在CF_privilege表中查找该privilegemasterkey对应的MenuID并选取其中PrivilegeAccess='Sys_Menu'的MenuName，MenuID，MenuUrl
#####查询结果：![Sys_menu](/.jpg)
###对订单(order)页面中的操作权限(sys_button)
#####查询sql语句：
#####伪代码：
#####查询结果：![Sys_button](/.jpg)
