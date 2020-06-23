package bastos.thauany.exemploescopo.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 18:01
 */

@Getter @Setter
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClassDAO {

    @Autowired
    private ClassJDBC classJDBC;
}
