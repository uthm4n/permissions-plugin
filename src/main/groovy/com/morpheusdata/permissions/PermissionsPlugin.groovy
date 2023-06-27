package com.morpheusdata.permissions

import com.morpheusdata.model.Permission
import com.morpheusdata.core.Plugin

class PermissionsPlugin extends Plugin {
        @Override
        String getCode() {
                return 'permissions-plugin'
        }

        @Override
        void initialize() {
                this.setName("Permissions Plugin");
                this.setPermissions([Permission.build('Uthman Custom Permission','uthman-custom-permission', [Permission.AccessType.none, Permission.AccessType.full])])
        }

        @Override
        void onDestroy() {}
}