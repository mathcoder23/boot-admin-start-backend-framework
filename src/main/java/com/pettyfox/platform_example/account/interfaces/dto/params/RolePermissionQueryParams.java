package com.pettyfox.platform_example.account.interfaces.dto.params;

import lombok.Getter;
import lombok.Setter;
import org.pettyfox.base.web.dto.params.BasePageParam;

/**
 * @author Petty Fox
 * @version 1.0
 * @date 2021/4/15 15:50
 */
@Getter
@Setter
public class RolePermissionQueryParams extends BasePageParam {
    private Long roleId;
}
