package com.morpheusdata.permissions

import com.morpheus.core.Plugin;

class PermissionsPlugin extends Plugin {

        @Override
        void initialize() {
                this.setName("Permissions Plugin");
                CustomTabProvider tabProvider = new CustomTabProvider(this, morpheus);
                this.registerProvider(tabProvider);
        }
}