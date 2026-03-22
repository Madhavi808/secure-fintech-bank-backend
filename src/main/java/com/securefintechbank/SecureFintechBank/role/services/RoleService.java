package com.securefintechbank.SecureFintechBank.role.services;

import com.securefintechbank.SecureFintechBank.res.Response;
import com.securefintechbank.SecureFintechBank.role.entity.Role;

import java.util.List;

public interface RoleService {

    Response<Role> createRole(Role roleRequest);

    Response<Role> updateRole(Role roleRequest);

    Response<List<Role>> getAllRoles();

    Response<?> deleteRole(Long id);
}
