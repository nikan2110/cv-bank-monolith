package telran.b7a.cv.dto.exceptions;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
@NoArgsConstructor
public class WrongCityException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = -6878819084308767014L;

}
