module org.none.jdk9playground {
    requires weld.se.core;
    requires cdi.api;
    requires javax.inject;
    requires weld.core.impl;
    requires weld.environment.common;

    requires javax.servlet.api;
    requires weld.spi;
    requires weld.servlet.core;
}
