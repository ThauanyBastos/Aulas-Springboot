package dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 21/06/2020 - 18:34
 */
@Getter @Setter
@Component
public class ClassDAO {

    @Autowired
    private ClassJDBC classJDBC;
}
